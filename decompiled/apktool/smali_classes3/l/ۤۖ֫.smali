.class public final Ll/ۤۖ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final ֫:Ll/ۚۘ֫;

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Ll/ܶۘ֫;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ܶۘ֫;Ljava/lang/String;IILl/֨ۘ֫;)V
    .locals 1

    .line 738
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۖ֫;->ܿ:Ll/ܶۘ֫;

    .line 734
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۤۖ֫;->ᩳ:Ljava/util/HashMap;

    .line 739
    iput-object p2, p0, Ll/ۤۖ֫;->ܽ:Ljava/lang/String;

    .line 740
    iput p3, p0, Ll/ۤۖ֫;->ۧ:I

    .line 741
    iput p4, p0, Ll/ۤۖ֫;->ܳ:I

    if-eqz p2, :cond_2

    .line 156
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 159
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_0

    .line 69
    invoke-static {p3, p4, p2}, Ll/᩹ۘ֫;->֫(IILjava/lang/String;)V

    .line 744
    :cond_0
    iput-object p5, p0, Ll/ۤۖ֫;->֫:Ll/ۚۘ֫;

    return-void

    .line 157
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "packageName should be nonempty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 155
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "package shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final binderDied()V
    .locals 2

    .line 749
    iget-object v0, p0, Ll/ۤۖ֫;->ܿ:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v1, Ll/۫ۖ֫;

    invoke-direct {v1, p0}, Ll/۫ۖ֫;-><init>(Ll/ۤۖ֫;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
