.class public final synthetic Ll/ۘۛ᩻;
.super Ljava/lang/Object;
.source "A6XJ"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘۛ᩻;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ۘۛ᩻;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    sget v0, Ll/ۛ۬ܺ;->᩶:I

    .line 422
    new-instance v0, Ll/۫۬ܺ;

    invoke-direct {v0}, Ll/۫۬ܺ;-><init>()V

    return-object v0

    .line 0
    :pswitch_0
    sget-object v0, Ll/ܳۤۡ;->ۧ:[C

    :try_start_0
    const-string v0, "SHA-512"

    .line 20
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 22
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 0
    :pswitch_1
    invoke-static {}, Ll/᩵ۛ᩻;->ܽ()Ll/ܳۛ᩻;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
