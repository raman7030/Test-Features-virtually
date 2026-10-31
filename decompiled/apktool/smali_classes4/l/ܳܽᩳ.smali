.class public final Ll/ܳܽᩳ;
.super Ljava/lang/Object;
.source "51WE"

# interfaces
.implements Ll/֡ܿᩳ;


# instance fields
.field public final ֫:Ll/᩻ܽᩳ;

.field public final ۧ:Ll/֡ܿᩳ;


# direct methods
.method public constructor <init>(Ll/᩻ܽᩳ;Ll/֡ܿᩳ;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p2, p0, Ll/ܳܽᩳ;->ۧ:Ll/֡ܿᩳ;

    .line 65
    iput-object p1, p0, Ll/ܳܽᩳ;->֫:Ll/᩻ܽᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܳܽᩳ;)Ll/᩻ܽᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳܽᩳ;->֫:Ll/᩻ܽᩳ;

    return-object p0
.end method


# virtual methods
.method public final reset()V
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ܳܽᩳ;->ۧ:Ll/֡ܿᩳ;

    invoke-interface {v0}, Ll/֡ܿᩳ;->reset()V

    return-void
.end method

.method public final size()J
    .locals 2

    .line 70
    iget-object v0, p0, Ll/ܳܽᩳ;->ۧ:Ll/֡ܿᩳ;

    invoke-interface {v0}, Ll/֡ܿᩳ;->size()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()J
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ܳܽᩳ;->ۧ:Ll/֡ܿᩳ;

    invoke-interface {v0}, Ll/֡ܿᩳ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic ֫(JLl/᩻ۖܽ;)V
    .locals 0

    .line 0
    invoke-static {p0, p3, p1, p2}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;Ll/᩻ۖܽ;J)V

    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;J)V
    .locals 1

    .line 85
    new-instance v0, Ll/ܿܽᩳ;

    invoke-direct {v0, p0, p1}, Ll/ܿܽᩳ;-><init>(Ll/ܳܽᩳ;Ljava/io/OutputStream;)V

    iget-object p1, p0, Ll/ܳܽᩳ;->ۧ:Ll/֡ܿᩳ;

    invoke-interface {p1, v0, p2, p3}, Ll/֡ܿᩳ;->֫(Ljava/io/OutputStream;J)V

    return-void
.end method

.method public final synthetic ֫(Ljava/security/MessageDigest;J)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;Ljava/security/MessageDigest;J)V

    return-void
.end method

.method public final ۧ()J
    .locals 4

    .line 19
    invoke-virtual {p0}, Ll/ܳܽᩳ;->size()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/ܳܽᩳ;->֫()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final synthetic ܽ()Ll/֡ܿᩳ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;)Ll/֡ܿᩳ;

    move-result-object v0

    return-object v0
.end method
