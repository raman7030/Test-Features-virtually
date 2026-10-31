.class public Ll/ܺ᩺᩵;
.super Ljava/lang/Object;
.source "YB6A"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IArchiveExtractCallback;


# instance fields
.field public ᩸:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public ᩹:Lnet/sf/sevenzipjbinding/ISequentialOutStream;


# direct methods
.method public constructor <init>(Lnet/sf/sevenzipjbinding/ISequentialOutStream;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Ll/ܺ᩺᩵;->᩹:Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    return-void
.end method


# virtual methods
.method public final getStream(ILnet/sf/sevenzipjbinding/ExtractAskMode;)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 0

    .line 84
    sget-object p1, Lnet/sf/sevenzipjbinding/ExtractAskMode;->EXTRACT:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ܺ᩺᩵;->᩹:Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final prepareOperation(Lnet/sf/sevenzipjbinding/ExtractAskMode;)V
    .locals 0

    return-void
.end method

.method public final setCompleted(J)V
    .locals 0

    return-void
.end method

.method public final setOperationResult(Lnet/sf/sevenzipjbinding/ExtractOperationResult;)V
    .locals 0

    .line 71
    iput-object p1, p0, Ll/ܺ᩺᩵;->᩸:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-void
.end method

.method public final setTotal(J)V
    .locals 0

    return-void
.end method

.method public final ֫()Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ܺ᩺᩵;->᩸:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-object v0
.end method
