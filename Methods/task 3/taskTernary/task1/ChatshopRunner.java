class ChatshopRunner{
	public static void main(String[] name){
		//System.out.println("main method started");
		boolean isChatAdded = ChatShop.createChatName("Bhelpuri");
		System.out.println("is chat created: " +isChatAdded);
		boolean ischatPriceAdded = ChatShop.addChatPrice(35.00);
		System.out.println("and the chat price is :"+ischatPriceAdded);
		//ChatShop.getChatPrice();
		ChattShop.createChatName("Masala Puri");
		ChattShop.createChatName("dahi puri");
		ChattShop.createChatName("sev puri");
		ChattShop.createChatName("pani puri");
		ChattShop.createChatName("gol gappa");
		ChattShop.createChatName("sukka gappa");
		//ChatShop.getChats();
		boolean isChatUpdated=ChattShop.upadateChatName("sev puri","masala mix");
		System.out.println(isChatUpdated);
				ChattShop.getChats();
		ChattShop.deleteChatName("gol gappa");
						ChattShop.getChats();

		//System.out.println("main method ended");

}
}