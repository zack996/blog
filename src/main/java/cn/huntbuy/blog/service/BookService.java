package cn.huntbuy.blog.service;

import cn.huntbuy.blog.dao.BookDao;
import cn.huntbuy.blog.domain.Book;
import cn.huntbuy.blog.domain.Category;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookService {
    @Resource
    BookDao bookDao;
    @Resource
    CategoryService categoryService;

    public List<Book> list() {
        return bookDao.findAll();
    }

    public List<Book> listByCategory(int cid) {
        return bookDao.listByCategory(cid);
    }
}