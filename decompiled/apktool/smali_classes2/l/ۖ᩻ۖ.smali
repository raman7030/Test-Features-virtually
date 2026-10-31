.class public final Ll/ۖ᩻ۖ;
.super Ljava/lang/Object;
.source "0B0D"

# interfaces
.implements Ll/ܶᩳۖ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Class;

.field public final synthetic ᩹:Ll/۠ᩳۖ;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ll/۠ᩳۖ;)V
    .locals 0

    .line 898
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩻ۖ;->᩸:Ljava/lang/Class;

    iput-object p2, p0, Ll/ۖ᩻ۖ;->᩹:Ll/۠ᩳۖ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 932
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Factory[typeHierarchy="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۖ᩻ۖ;->᩸:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖ᩻ۖ;->᩹:Ll/۠ᩳۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 0

    .line 902
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p1

    .line 903
    iget-object p2, p0, Ll/ۖ᩻ۖ;->᩸:Ljava/lang/Class;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 906
    :cond_0
    new-instance p2, Ll/ܺ᩻ۖ;

    invoke-direct {p2, p0, p1}, Ll/ܺ᩻ۖ;-><init>(Ll/ۖ᩻ۖ;Ljava/lang/Class;)V

    return-object p2
.end method
