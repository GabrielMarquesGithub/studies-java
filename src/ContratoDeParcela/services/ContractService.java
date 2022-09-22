package ContratoDeParcela.services;

import ContratoDeParcela.entities.Contract;
import ContratoDeParcela.entities.Installment;

public class ContractService {

	PaymentInterface paymentService;

	public ContractService(PaymentInterface paymentService) {
		this.paymentService = paymentService;
	}

	public void createInstallment(Contract contract, int NumberOfInstallment) {
		double baseQuota = contract.getTotalValue() / NumberOfInstallment;
		for (int i = 0; i < NumberOfInstallment; i++) {
			double quota = this.paymentService.calculateInstallmentValue(baseQuota, i + 1);
			contract.addInstallments(new Installment(contract.getDate().plusMonths(i + 1), quota));
		}

	}
}
