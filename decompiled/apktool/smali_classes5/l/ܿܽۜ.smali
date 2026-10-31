.class public final Ll/ܿܽۜ;
.super Ll/ۧܿܽ;
.source "Q77G"


# instance fields
.field public final ᩸:[Ll/᩸᩻ܽ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ll/᩸᩻ܽ;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 348
    iput-object p1, p0, Ll/ܿܽۜ;->᩹:Ljava/lang/String;

    .line 349
    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩸᩻ܽ;

    iput-object p1, p0, Ll/ܿܽۜ;->᩸:[Ll/᩸᩻ܽ;

    return-void
.end method


# virtual methods
.method public final getStyle()[I
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 354
    iget-object v0, p0, Ll/ܿܽۜ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ܰ֫()[Ll/᩸᩻ܽ;
    .locals 1

    .line 369
    invoke-virtual {p0}, Ll/ܿܽۜ;->᩶֫()[Ll/᩸᩻ܽ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۧܿܽ;->֫([Ll/᩸᩻ܽ;)[Ll/᩸᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩶֫()[Ll/᩸᩻ܽ;
    .locals 2

    .line 364
    iget-object v0, p0, Ll/ܿܽۜ;->᩸:[Ll/᩸᩻ܽ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸᩻ܽ;

    return-object v0
.end method

.method public final ᩺֫()Z
    .locals 1

    .line 374
    iget-object v0, p0, Ll/ܿܽۜ;->᩸:[Ll/᩸᩻ܽ;

    if-eqz v0, :cond_0

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
