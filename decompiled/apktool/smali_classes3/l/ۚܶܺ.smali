.class public final Ll/ۚܶܺ;
.super Ll/ۖܶܺ;
.source "R32H"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ll/ۖܶܺ;-><init>()V

    .line 32
    iput-object p1, p0, Ll/ۚܶܺ;->᩸:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 83
    instance-of v0, p1, Ll/ۚܶܺ;

    if-eqz v0, :cond_0

    .line 84
    check-cast p1, Ll/ۚܶܺ;

    .line 85
    iget-object v0, p0, Ll/ۚܶܺ;->᩸:Ljava/lang/Object;

    iget-object p1, p1, Ll/ۚܶܺ;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 92
    iget-object v0, p0, Ll/ۚܶܺ;->᩸:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0x598df91c

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Optional.of("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۚܶܺ;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩸ۗܺ;)Ljava/lang/Object;
    .locals 0

    .line 48
    iget-object p1, p0, Ll/ۚܶܺ;->᩸:Ljava/lang/Object;

    return-object p1
.end method
