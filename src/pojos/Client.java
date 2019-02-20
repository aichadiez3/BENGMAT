package pojos;

import java.io.Serializable;

public class Client implements Serializable {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Integer id;
	    private String name;
	    private Integer telephone;
	    private String bank_account;
	    private String responsible;
	   
	    
		public Client() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Client(Integer id, String name, Integer telephone, String bank_account, String responsible) {
			super();
			this.id = id;
			this.name = name;
			this.telephone = telephone;
			this.bank_account = bank_account;
			this.responsible = responsible;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Integer getTelephone() {
			return telephone;
		}


		public void setTelephone(Integer telephone) {
			this.telephone = telephone;
		}


		public String getBank_account() {
			return bank_account;
		}


		public void setBank_account(String bank_account) {
			this.bank_account = bank_account;
		}


		public String getResponsible() {
			return responsible;
		}


		public void setResponsible(String responsible) {
			this.responsible = responsible;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Client other = (Client) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Client [id=" + id + ", name=" + name + ", telephone=" + telephone + ", bank_account=" + bank_account
					+ ", responsible=" + responsible + "]";
		}

		
	    

}