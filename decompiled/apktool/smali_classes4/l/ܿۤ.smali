.class public final Ll/ܿۤ;
.super Ljava/lang/Object;
.source "M5X0"


# instance fields
.field public final ֫:Z

.field public final ۧ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;IIZI)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    iput-object p1, p0, Ll/ܿۤ;->ᩳ:Landroid/net/Uri;

    .line 289
    iput p2, p0, Ll/ܿۤ;->ܽ:I

    .line 290
    iput p3, p0, Ll/ܿۤ;->ܿ:I

    .line 291
    iput-boolean p4, p0, Ll/ܿۤ;->֫:Z

    .line 292
    iput p5, p0, Ll/ܿۤ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 340
    iget v0, p0, Ll/ܿۤ;->ۧ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 317
    iget v0, p0, Ll/ܿۤ;->ܽ:I

    return v0
.end method

.method public final ܽ()Landroid/net/Uri;
    .locals 1

    .line 310
    iget-object v0, p0, Ll/ܿۤ;->ᩳ:Landroid/net/Uri;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 331
    iget-boolean v0, p0, Ll/ܿۤ;->֫:Z

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 324
    iget v0, p0, Ll/ܿۤ;->ܿ:I

    return v0
.end method
