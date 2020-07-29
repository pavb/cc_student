package ml.brainin;

public interface ICombustible {
	void burning(int temperature) throws RuntimeException;
	void gefrigerate(int temperature) throws RuntimeException;
}
