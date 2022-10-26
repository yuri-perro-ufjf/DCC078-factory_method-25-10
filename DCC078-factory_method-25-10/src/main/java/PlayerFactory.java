public class PlayerFactory {
    public static IPlayer getPlayer(String player){
        Class classe = null;
        Object object = null;

        try{
            classe = Class.forName(player);
            object = classe.newInstance();
        }catch (Exception ex){
            throw new IllegalArgumentException("Invalid Player!");
        }

        if(!(object instanceof IPlayer)){
            throw new IllegalArgumentException("Invalid object instance player!");
        }

        return (IPlayer) object;
    }
}
