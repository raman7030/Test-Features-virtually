.class public final Ll/۫ܳ֨;
.super Landroid/database/ContentObserver;
.source "QBKJ"


# instance fields
.field public ֫:I

.field public ۧ:Ll/۬ܳ֨;


# direct methods
.method public constructor <init>(Ll/۬ܳ֨;I)V
    .locals 1

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 17
    iput-object p1, p0, Ll/۫ܳ֨;->ۧ:Ll/۬ܳ֨;

    .line 18
    iput p2, p0, Ll/۫ܳ֨;->֫:I

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 0

    .line 25
    iget-object p1, p0, Ll/۫ܳ֨;->ۧ:Ll/۬ܳ֨;

    if-eqz p1, :cond_0

    .line 26
    iget p1, p0, Ll/۫ܳ֨;->֫:I

    invoke-static {p1}, Ll/۬ܳ֨;->֫(I)V

    :cond_0
    return-void
.end method
