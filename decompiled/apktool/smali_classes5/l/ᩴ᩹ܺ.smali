.class public Ll/ᩴ᩹ܺ;
.super Ljava/lang/ref/SoftReference;
.source "E3QI"

# interfaces
.implements Ll/ۗ᩹ܺ;


# instance fields
.field public final ᩸:Ll/᩻᩶ܺ;


# direct methods
.method public constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Ll/᩻᩶ܺ;)V
    .locals 0

    .line 1523
    invoke-direct {p0, p2, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 1524
    iput-object p3, p0, Ll/ᩴ᩹ܺ;->᩸:Ll/᩻᩶ܺ;

    return-void
.end method


# virtual methods
.method public final getEntry()Ll/᩻᩶ܺ;
    .locals 1

    .line 1534
    iget-object v0, p0, Ll/ᩴ᩹ܺ;->᩸:Ll/᩻᩶ܺ;

    return-object v0
.end method

.method public ֫(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Ll/᩻᩶ܺ;)Ll/ۗ᩹ܺ;
    .locals 1

    .line 1543
    new-instance v0, Ll/ᩴ᩹ܺ;

    invoke-direct {v0, p1, p2, p3}, Ll/ᩴ᩹ܺ;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Ll/᩻᩶ܺ;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 1558
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
