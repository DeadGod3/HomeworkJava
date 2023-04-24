package pustovit.homework.homework_26.service;

import pustovit.homework.homework_26.dao.OwnerDao;
import pustovit.homework.homework_26.entity.Owner;

public class OwnerService {
    private OwnerDao ownerDao = new OwnerDao();

    public void save(Owner owner){
        ownerDao.save(owner);
    }

}
