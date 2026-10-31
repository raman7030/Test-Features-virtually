.class public final Ll/ᩳ۬ܿ;
.super Ljava/lang/Object;
.source "S5I2"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ll/۫ۘܽ;


# direct methods
.method public constructor <init>(Ll/ۨۘܽ;Z)V
    .locals 1

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 164
    invoke-virtual {p1, v0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ۬ܿ;->ۧ:Ll/۫ۘܽ;

    .line 165
    iput-boolean p2, p0, Ll/ᩳ۬ܿ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ᩳ۬ܿ;->ۧ:Ll/۫ۘܽ;

    invoke-virtual {v0, p1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 170
    iget-boolean p1, p0, Ll/ᩳ۬ܿ;->֫:Z

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ll/۫ۘܽ;->matches()Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result p1

    return p1
.end method
