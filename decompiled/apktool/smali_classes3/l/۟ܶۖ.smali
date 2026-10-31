.class public abstract Ll/۟ܶۖ;
.super Ll/ۛ᩸ۘ;
.source "05YL"


# instance fields
.field public ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۛ᩸ۘ;
    .locals 0

    .line 50
    new-instance p1, Ll/ܰܶۖ;

    invoke-direct {p1, p0}, Ll/ܰܶۖ;-><init>(Ll/۟ܶۖ;)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۛ᩸ۘ;
    .locals 1

    .line 43
    new-instance p1, Ll/ۧ᩸ۖ;

    sget-object v0, Ll/ܽܶۖ;->ۙ:Ll/ܽܶۖ;

    invoke-direct {p1, p2, v0}, Ll/ۧ᩸ۖ;-><init>(Ljava/lang/String;Ll/ܽܶۖ;)V

    .line 44
    iget-object p2, p0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 38
    iget-object p2, p0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 69
    iget-object p1, p0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    new-instance v0, Ll/ܰ۠ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p3, p2}, Ll/ܰ۠ۖ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
