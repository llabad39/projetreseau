import java.util.*;
    
public class Entity{
    String ip;
    String id;
    String port_udp;
    String port_tcp;
    String ip_next;
    String port_udp_next;
    String ip_diff;
    String port_diff;

    String ip_next2;
    String port_udp_next2;
    //String ip; l'addresse de la machine locale
    
    public Entity(String _ip,String _id,String _port_udp,String _port_tcp){
	this.ip=_ip;
	this.id = _id;
	this.port_udp = _port_udp;
	this.port_tcp = _port_tcp;
	this.ip_next2 = null;
	this.port_udp_next2 = null;
    }
    
    public Entity(String _ip,String _id,String _port_udp,String _port_tcp,String _ip_diff,String _port_diff){
	this.ip=_ip;
	this.id = _id;
	this.port_udp = _port_udp;
	this.port_tcp = _port_tcp;
	this.ip_diff = _ip_diff;
	this.port_diff = _port_diff;
	this.ip_next2 = null;
	this.port_udp_next2 = null;  
    }

    public String getId(){
	return this.id;
    }

    public void setPortUdpNext(String _port_udp_next){
	this.port_udp_next = _port_udp_next;
    }

    public String getPortUdpNext(){
	return this.port_udp_next;
    }

    public String getIpNext(){
	return this.ip_next;
    }

    public void setIpNext(String _ip_next){
	this.ip_next = _ip_next;
    }

    public String getIpDiff(){
	return this.ip_diff;
    }

    public void setIpDiff(String _ip_diff){
	this.ip_diff = _ip_diff;
    }

    public String getPortDiff(){
	return this.port_diff;
    }

    public void setPortDiff(String _port_diff){
	this.port_diff = _port_diff;
    }

    public String getIpNext2(){
	return this.ip_next2;
    }

    public void setIpNext2(String _ip_next2){
	this.ip_next2 = _ip_next2;
    }

    public String getPortUdpNext2(){
	return this.port_udp_next2;
    }

    public void setPortUdpNext2(String _port_udp_next2){
	this.port_udp_next2 = _port_udp_next2;
    }


}
