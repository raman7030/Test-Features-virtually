.class public final Ll/ܿᩴ֡;
.super Ll/᩺ۘ֡;
.source "V2E3"


# instance fields
.field public final ۧ:Z

.field public final ܽ:Ll/᩷ܺ֡;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/ۨۘ֡;-><init>()V

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Ll/᩷ܺ֡;->֫(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/᩷ܺ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ܿᩴ֡;->ܽ:Ll/᩷ܺ֡;

    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Ll/ܿᩴ֡;->ۧ:Z

    return-void
.end method

.method public static ֫(II)Ll/ܿᩴ֡;
    .locals 1

    .line 85
    new-instance v0, Ll/ܿᩴ֡;

    invoke-direct {v0, p0, p1}, Ll/ܿᩴ֡;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public final ֫(ILjava/io/StringWriter;)Z
    .locals 2

    .line 104
    iget-object v0, p0, Ll/ܿᩴ֡;->ܽ:Ll/᩷ܺ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩷ܺ֡;->֫(Ljava/lang/Integer;)Z

    move-result v0

    iget-boolean v1, p0, Ll/ܿᩴ֡;->ۧ:Z

    if-eq v1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "&#"

    .line 107
    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0xa

    .line 108
    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 p1, 0x3b

    .line 109
    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(I)V

    const/4 p1, 0x1

    return p1
.end method
