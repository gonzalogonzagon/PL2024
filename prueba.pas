program prueba;
function operacion(a: INTEGER; b: REAL): INTEGER;
begin
	a := a + 2;
	b := b - 3 div 2;
	operacion := a + b;
end;
var
	a, c, b: INTEGER;
begin
	if(a >= 3 OR b <= c AND c = 0 AND NOT (a < 2))then
	begin
		a := b * c + 2 - 8;
	b := a div 3 mod 2;
	end
	else
	begin
		c := 3 * operacion (a, b) div 8 mod operacion (b, a);
	end;
end.