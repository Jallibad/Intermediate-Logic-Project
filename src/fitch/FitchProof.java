package fitch;

import javafx.scene.layout.Pane;
import main.LogicSystem;

public class FitchProof extends LogicSystem
{
	Proof p;
	
	@Override
	public String name()
	{
		return "Fitch";
	}

	@Override
	public Pane display()
	{
		Pane canvas = new Pane();
		return canvas;
	}
}
