.class public final Ll/ۛ᩵ܿ;
.super Landroid/os/ProxyFileDescriptorCallback;
.source "X13G"


# instance fields
.field public final synthetic ֫:Ll/᩻ۖܽ;

.field public final synthetic ۧ:J


# direct methods
.method public constructor <init>(JLl/᩻ۖܽ;)V
    .locals 0

    .line 216
    iput-wide p1, p0, Ll/ۛ᩵ܿ;->ۧ:J

    iput-object p3, p0, Ll/ۛ᩵ܿ;->֫:Ll/᩻ۖܽ;

    invoke-direct {p0}, Landroid/os/ProxyFileDescriptorCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGetSize()J
    .locals 2

    .line 220
    iget-wide v0, p0, Ll/ۛ᩵ܿ;->ۧ:J

    return-wide v0
.end method

.method public final onRead(JI[B)I
    .locals 1

    .line 226
    :try_start_0
    iget-object v0, p0, Ll/ۛ᩵ܿ;->֫:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    .line 227
    iget-object p1, p0, Ll/ۛ᩵ܿ;->֫:Ll/᩻ۖܽ;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p3, p4}, Ll/᩻ۖܽ;->ۧ(II[B)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 229
    new-instance p2, Landroid/system/ErrnoException;

    const-string p3, "onRead"

    sget p4, Landroid/system/OsConstants;->EIO:I

    invoke-direct {p2, p3, p4, p1}, Landroid/system/ErrnoException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw p2
.end method

.method public final onRelease()V
    .locals 1

    .line 235
    iget-object v0, p0, Ll/ۛ᩵ܿ;->֫:Ll/᩻ۖܽ;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method
