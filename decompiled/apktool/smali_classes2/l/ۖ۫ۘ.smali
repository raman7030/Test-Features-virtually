.class public final Ll/ۖ۫ۘ;
.super Ll/۠۫ۘ;
.source "U4HR"


# instance fields
.field public final ۧ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 277
    sget-object v0, Ll/֨۫ۘ;->᩶:Ll/֨۫ۘ;

    invoke-direct {p0, v0}, Ll/۠۫ۘ;-><init>(Ll/֨۫ۘ;)V

    .line 266
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 286
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<!--"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    iget-object v1, p0, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/۠۫ۘ;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/۠۫ۘ;->֫(Ljava/lang/StringBuilder;)V

    return-object p0
.end method
