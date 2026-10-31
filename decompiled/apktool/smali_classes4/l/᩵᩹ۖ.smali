.class public Ll/᩵᩹ۖ;
.super Ljava/lang/Object;
.source "Y5PA"


# instance fields
.field public ֫:Ll/ۘ᩸ۖ;


# direct methods
.method public constructor <init>(Ll/ۘ᩸ۖ;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/᩵᩹ۖ;->֫:Ll/ۘ᩸ۖ;

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/ܽ᩸ۖ;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/᩵᩹ۖ;->֫:Ll/ۘ᩸ۖ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 44
    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۘ᩸ۖ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/ܽ᩸ۖ;

    move-result-object p1

    return-object p1
.end method

.method public ֫()V
    .locals 1

    .line 48
    iget-object v0, p0, Ll/᩵᩹ۖ;->֫:Ll/ۘ᩸ۖ;

    if-nez v0, :cond_0

    return-void

    .line 51
    :cond_0
    invoke-virtual {v0}, Ll/᩵᩹ۖ;->֫()V

    return-void
.end method

.method public ֫(I)V
    .locals 1

    .line 35
    iget-object v0, p0, Ll/᩵᩹ۖ;->֫:Ll/ۘ᩸ۖ;

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {v0, p1}, Ll/ۘ᩸ۖ;->֫(I)V

    :cond_0
    return-void
.end method
