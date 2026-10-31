.class public final Ll/ܿ᩵᩻;
.super Ljava/lang/Object;
.source "R8AK"


# instance fields
.field public final synthetic ֫:Ll/ۙ᩵᩻;

.field public final synthetic ۧ:Ll/᩷᩵᩻;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۙ᩵᩻;Ll/᩷᩵᩻;Ljava/lang/String;I)V
    .locals 0

    .line 345
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩵᩻;->֫:Ll/ۙ᩵᩻;

    iput-object p2, p0, Ll/ܿ᩵᩻;->ۧ:Ll/᩷᩵᩻;

    iput-object p3, p0, Ll/ܿ᩵᩻;->ܽ:Ljava/lang/String;

    iput p4, p0, Ll/ܿ᩵᩻;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫(J)I
    .locals 6

    .line 366
    iget-object v0, p0, Ll/ܿ᩵᩻;->֫:Ll/ۙ᩵᩻;

    invoke-static {v0}, Ll/ۙ᩵᩻;->ᩳ(Ll/ۙ᩵᩻;)V

    .line 367
    invoke-static {v0}, Ll/ۙ᩵᩻;->ܿ(Ll/ۙ᩵᩻;)V

    .line 369
    :try_start_0
    iget-object v1, p0, Ll/ܿ᩵᩻;->ۧ:Ll/᩷᩵᩻;

    iget-object v2, p0, Ll/ܿ᩵᩻;->ܽ:Ljava/lang/String;

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    if-nez v5, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, v2, p1}, Ll/ۙ᩵᩻;->ۧ(Ll/ۙ᩵᩻;Ljava/lang/String;Z)Ll/۟ܽۘ;

    move-result-object p1

    invoke-static {v1, p1}, Ll/᩷᩵᩻;->֫(Ll/᩷᩵᩻;Ll/۟ܽۘ;)V
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    invoke-static {v0}, Ll/ۙ᩵᩻;->ܽ(Ll/ۙ᩵᩻;)Ll/ۤ᩵᩻;

    move-result-object p1

    iget-object p1, p1, Ll/ۤ᩵᩻;->ۧ:Ll/᩻ۧۘ;

    invoke-virtual {p1}, Ll/᩻ۧۘ;->ᩳ()I

    move-result p1

    .line 374
    iget p2, p0, Ll/ܿ᩵᩻;->ᩳ:I

    invoke-static {p2, p1}, Ll/ۙ᩵᩻;->֫(II)I

    move-result p1

    return p1

    :catch_0
    move-exception p1

    .line 371
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
