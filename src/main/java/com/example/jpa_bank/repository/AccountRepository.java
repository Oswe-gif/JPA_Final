package com.example.jpa_bank.repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.jpa_bank.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
    @Modifying
    @Query(value = "update ACCOUNT a set a.MONEY = a.Money+ :money  where a.ID = :idAccount",nativeQuery = true)
    void depositMoney(@Param("money") int money,@Param("idAccount") int idAccount);
    @Query(value ="select * from ACCOUNT where USER = ?1", nativeQuery = true)
    List<AccountEntity> getAllAccounts(int documentUser);
}