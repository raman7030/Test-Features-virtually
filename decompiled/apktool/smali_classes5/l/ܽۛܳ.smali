.class public final Ll/ܽۛܳ;
.super Ljava/lang/Object;
.source "HAIH"

# interfaces
.implements Ll/᩷᩻ᩳ;


# instance fields
.field public final synthetic ۙ:Ll/ܺۛܳ;

.field public final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ᩸:Ll/ۖۛܳ;

.field public final synthetic ᩹:Ll/۠᩵ܳ;


# direct methods
.method public constructor <init>(Ll/ۖۛܳ;Ll/ܺۛܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/۠᩵ܳ;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۛܳ;->᩸:Ll/ۖۛܳ;

    iput-object p2, p0, Ll/ܽۛܳ;->ۙ:Ll/ܺۛܳ;

    iput-object p3, p0, Ll/ܽۛܳ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Ll/ܽۛܳ;->᩹:Ll/۠᩵ܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 190
    iget-object v0, p0, Ll/ܽۛܳ;->ۙ:Ll/ܺۛܳ;

    invoke-static {v0, p1}, Ll/ܺۛܳ;->֫(Ll/ܺۛܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public final ֫(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 2

    .line 174
    :try_start_0
    iget-object v0, p0, Ll/ܽۛܳ;->᩸:Ll/ۖۛܳ;

    iget-object v1, p0, Ll/ܽۛܳ;->ۙ:Ll/ܺۛܳ;

    invoke-static {v0, p1, v1}, Ll/ۖۛܳ;->֫(Ll/ۖۛܳ;Lnet/sf/sevenzipjbinding/IInArchive;Ll/ܺۛܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 178
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 180
    throw v0
.end method

.method public final ܽ()V
    .locals 2

    .line 185
    iget-object v0, p0, Ll/ܽۛܳ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ܽۛܳ;->᩹:Ll/۠᩵ܳ;

    invoke-virtual {v0}, Ll/۠᩵ܳ;->getAsBoolean()Z

    move-result v0

    return v0
.end method
