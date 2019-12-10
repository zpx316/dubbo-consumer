package zp.learn.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import zp.learn.dubbo.bean.Movie;
import zp.learn.dubbo.bean.Order;
import zp.learn.dubbo.bean.User;

/**
 * @author zp
 * @Description:
 * @date 2019-12-02 16:02
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Reference
    private MovieService movieService;
    @Override
    public Order getNewMovie(User user) {

        Order order = new Order();


        Movie movie = movieService.getNewMovie();
        System.out.println("调用远程方法");
        order.setUserName(user.getUserName());
        order.setMovieId(movie.getId());
        order.setMovieName(movie.getMovieName());
        return order;
    }
}