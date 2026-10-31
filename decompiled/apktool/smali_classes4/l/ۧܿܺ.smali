.class public abstract Ll/ۧܿܺ;
.super Ljava/lang/Object;
.source "NB9T"

# interfaces
.implements Ll/ۛᩳܺ;


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ܰᩳܺ;

.field public final ܽ:Ll/۫ܺܺ;

.field public final ᩳ:Ll/᩶ܺܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;ILl/᩶ܺܺ;Ll/ܰᩳܺ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 70
    iput-object p1, p0, Ll/ۧܿܺ;->ܽ:Ll/۫ܺܺ;

    .line 71
    iput p2, p0, Ll/ۧܿܺ;->֫:I

    .line 72
    iput-object p3, p0, Ll/ۧܿܺ;->ᩳ:Ll/᩶ܺܺ;

    .line 73
    iput-object p4, p0, Ll/ۧܿܺ;->ۧ:Ll/ܰᩳܺ;

    return-void

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "definingClass == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getAttributes()Ll/ܰᩳܺ;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ۧܿܺ;->ۧ:Ll/ܰᩳܺ;

    return-object v0
.end method

.method public final getName()Ll/۬ܺܺ;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۧܿܺ;->ᩳ:Ll/᩶ܺܺ;

    invoke-virtual {v0}, Ll/᩶ܺܺ;->getName()Ll/۬ܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    iget-object v1, p0, Ll/ۧܿܺ;->ᩳ:Ll/᩶ܺܺ;

    invoke-virtual {v1}, Ll/᩶ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()Ll/᩶ܺܺ;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۧܿܺ;->ᩳ:Ll/᩶ܺܺ;

    return-object v0
.end method

.method public final ܳ()Ll/۫ܺܺ;
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۧܿܺ;->ܽ:Ll/۫ܺܺ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 104
    iget v0, p0, Ll/ۧܿܺ;->֫:I

    return v0
.end method

.method public final ᩻()Ll/۬ܺܺ;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۧܿܺ;->ᩳ:Ll/᩶ܺܺ;

    invoke-virtual {v0}, Ll/᩶ܺܺ;->ܺ()Ll/۬ܺܺ;

    move-result-object v0

    return-object v0
.end method
