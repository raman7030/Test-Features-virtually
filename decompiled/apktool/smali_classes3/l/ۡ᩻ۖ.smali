.class public final Ll/ۡ᩻ۖ;
.super Ljava/lang/Object;
.source "0B0D"

# interfaces
.implements Ll/ܶᩳۖ;


# instance fields
.field public final synthetic ᩸:Ll/۠ᩳۖ;


# direct methods
.method public constructor <init>(Ll/۠ᩳۖ;)V
    .locals 0

    .line 871
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩻ۖ;->᩸:Ll/۠ᩳۖ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 881
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Factory[type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/Calendar;

    .line 882
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Ljava/util/GregorianCalendar;

    .line 884
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ᩻ۖ;->᩸:Ll/۠ᩳۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 0

    .line 875
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p1

    .line 876
    const-class p2, Ljava/util/Calendar;

    if-eq p1, p2, :cond_1

    const-class p2, Ljava/util/GregorianCalendar;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Ll/ۡ᩻ۖ;->᩸:Ll/۠ᩳۖ;

    return-object p1
.end method
