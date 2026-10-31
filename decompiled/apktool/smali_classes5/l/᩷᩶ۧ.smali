.class public Ll/᩷᩶ۧ;
.super Ljava/lang/Object;
.source "79M1"

# interfaces
.implements Ll/᩷ۤۧ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    .line 76
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    .line 78
    new-instance p1, Ll/ۜ᩶ۧ;

    .line 151
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    .line 82
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 94
    new-instance v0, Ll/ᩳ᩶ۧ;

    invoke-direct {v0, p0, p1}, Ll/ᩳ᩶ۧ;-><init>(Ll/᩷᩶ۧ;Landroid/content/Context;)V

    invoke-static {v0}, Ll/ܳ᩶ۧ;->֫(Ljava/lang/Runnable;)V

    .line 83
    new-instance p1, Ll/ۜ᩶ۧ;

    .line 151
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 126
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method
