package huy.dev.data.dao;
import huy.dev.data.impl.CategoryImpl;
import huy.dev.data.impl.OrderImpl;
import huy.dev.data.impl.OrderItemImpl;
import huy.dev.data.impl.ProductImpl;
import huy.dev.data.impl.UserImpl;
public class Database extends DatabaseDao {

    
    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return (CategoryDao) new CategoryImpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return (OrderItemDao) new OrderItemImpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }
    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return (UserDao) new UserImpl();
    }
	@Override
	public ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return (ProductDao) new ProductImpl();
	}

}