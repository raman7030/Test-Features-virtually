.class public final Ll/᩹ۡܿ;
.super Ljava/lang/Object;
.source "R704"


# instance fields
.field public final ֫:Ll/ۨۡܿ;

.field public ۧ:Z

.field public ܽ:Ll/ۧܺܿ;

.field public ᩳ:Ll/۟᩸ᩳ;


# direct methods
.method public constructor <init>(Ll/ۨۡܿ;)V
    .locals 0

    .line 1224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1225
    iput-object p1, p0, Ll/᩹ۡܿ;->֫:Ll/ۨۡܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۡܿ;->֫:Ll/ۨۡܿ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩹ۡܿ;Ll/۟᩸ᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ۡܿ;->ᩳ:Ll/۟᩸ᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۡܿ;Ll/ۧܺܿ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ۡܿ;->ܽ:Ll/ۧܺܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۡܿ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩹ۡܿ;->ۧ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩹ۡܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩹ۡܿ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/᩹ۡܿ;)Ll/ۧܺܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۡܿ;->ܽ:Ll/ۧܺܿ;

    return-object p0
.end method

.method public static ᩳ(Ll/᩹ۡܿ;)V
    .locals 3

    const/4 v0, 0x0

    .line 1230
    :try_start_0
    iget-object v1, p0, Ll/᩹ۡܿ;->ܽ:Ll/ۧܺܿ;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ll/ۧܺܿ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1232
    :cond_0
    iput-object v0, p0, Ll/᩹ۡܿ;->ܽ:Ll/ۧܺܿ;

    .line 1233
    iget-object v1, p0, Ll/᩹ۡܿ;->ᩳ:Ll/۟᩸ᩳ;

    .line 1234
    iput-object v0, p0, Ll/᩹ۡܿ;->ᩳ:Ll/۟᩸ᩳ;

    if-eqz v1, :cond_1

    .line 1235
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 1232
    iput-object v0, p0, Ll/᩹ۡܿ;->ܽ:Ll/ۧܺܿ;

    .line 1233
    iget-object v2, p0, Ll/᩹ۡܿ;->ᩳ:Ll/۟᩸ᩳ;

    .line 1234
    iput-object v0, p0, Ll/᩹ۡܿ;->ᩳ:Ll/۟᩸ᩳ;

    if-eqz v2, :cond_2

    .line 1235
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V

    .line 1236
    :cond_2
    throw v1
.end method
