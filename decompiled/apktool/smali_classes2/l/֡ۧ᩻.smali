.class public final synthetic Ll/֡ۧ᩻;
.super Ljava/lang/Object;
.source "22BV"

# interfaces
.implements Ljava/util/function/BooleanSupplier;


# instance fields
.field public final synthetic ᩸:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۧ᩻;->᩸:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final getAsBoolean()Z
    .locals 4

    .line 2
    iget-object v0, p0, Ll/֡ۧ᩻;->᩸:Landroid/net/Uri;

    const/4 v1, 0x1

    .line 448
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "r"

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 450
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return v1

    :catch_0
    move-exception v0

    .line 451
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v2, "Permission denied"

    .line 452
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method
