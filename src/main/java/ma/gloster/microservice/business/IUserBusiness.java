package ma.gloster.microservice.business;

import ma.gloster.microservice.dto.UserDto;

/**
 * The Interface IUserBusiness.
 */
public interface IUserBusiness {
	
	/**
	 * Update user.
	 *
	 * @param userDto the user dto
	 */
	public void updateUser(UserDto userDto);
	
	/**
	 * Afficher user.
	 *
	 * @param userDto the user dto
	 */
	public void AfficherUser(UserDto userDto);

}
