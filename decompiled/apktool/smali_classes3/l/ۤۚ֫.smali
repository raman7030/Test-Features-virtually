.class public final Ll/ۤۚ֫;
.super Landroid/telephony/TelephonyCallback;
.source "J8TX"

# interfaces
.implements Landroid/telephony/TelephonyCallback$DisplayInfoListener;


# instance fields
.field public final ֫:Ll/ۧ֨֫;


# direct methods
.method public constructor <init>(Ll/ۧ֨֫;)V
    .locals 0

    .line 284
    invoke-direct {p0}, Landroid/telephony/TelephonyCallback;-><init>()V

    .line 285
    iput-object p1, p0, Ll/ۤۚ֫;->֫:Ll/ۧ֨֫;

    return-void
.end method


# virtual methods
.method public final onDisplayInfoChanged(Landroid/telephony/TelephonyDisplayInfo;)V
    .locals 2

    .line 290
    invoke-virtual {p1}, Landroid/telephony/TelephonyDisplayInfo;->getOverrideNetworkType()I

    move-result p1

    const/4 v0, 0x3

    const/4 v1, 0x5

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 295
    :goto_1
    iget-object v0, p0, Ll/ۤۚ֫;->֫:Ll/ۧ֨֫;

    if-eqz p1, :cond_2

    const/16 v1, 0xa

    :cond_2
    invoke-static {v0, v1}, Ll/ۧ֨֫;->֫(Ll/ۧ֨֫;I)V

    return-void
.end method
