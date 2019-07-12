package np.edu.nast.portfoliotracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {

}
