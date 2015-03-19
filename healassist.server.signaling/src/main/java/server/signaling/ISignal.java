package server.signaling;

public interface ISignal {
	public Object read();
	public Boolean set(Object newSigVal);
}
