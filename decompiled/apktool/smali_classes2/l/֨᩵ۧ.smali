.class public final Ll/֨᩵ۧ;
.super Ljava/lang/Object;
.source "B8H5"

# interfaces
.implements Ll/ܰۘۧ;


# instance fields
.field public final ۗ:Ll/ܺ᩵ۧ;

.field public final ۙ:Ljava/util/HashMap;

.field public final ᩶:Ljava/util/HashMap;

.field public final ᩸:[J

.field public final ᩹:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ll/ܺ᩵ۧ;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/֨᩵ۧ;->ۗ:Ll/ܺ᩵ۧ;

    .line 42
    iput-object p3, p0, Ll/֨᩵ۧ;->ۙ:Ljava/util/HashMap;

    .line 43
    iput-object p4, p0, Ll/֨᩵ۧ;->᩶:Ljava/util/HashMap;

    .line 45
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Ll/֨᩵ۧ;->᩹:Ljava/util/Map;

    .line 46
    invoke-virtual {p1}, Ll/ܺ᩵ۧ;->ۧ()[J

    move-result-object p1

    iput-object p1, p0, Ll/֨᩵ۧ;->᩸:[J

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 57
    iget-object v0, p0, Ll/֨᩵ۧ;->᩸:[J

    array-length v0, v0

    return v0
.end method

.method public final ֫(J)I
    .locals 2

    const/4 v0, 0x0

    .line 51
    iget-object v1, p0, Ll/֨᩵ۧ;->᩸:[J

    invoke-static {v1, p1, p2, v0}, Ll/ۘ֨֫;->֫([JJZ)I

    move-result p1

    .line 52
    array-length p2, v1

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I)J
    .locals 3

    .line 62
    iget-object v0, p0, Ll/֨᩵ۧ;->᩸:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final ܽ(J)Ljava/util/List;
    .locals 6

    .line 72
    iget-object v4, p0, Ll/֨᩵ۧ;->ۙ:Ljava/util/HashMap;

    iget-object v5, p0, Ll/֨᩵ۧ;->᩶:Ljava/util/HashMap;

    iget-object v0, p0, Ll/֨᩵ۧ;->ۗ:Ll/ܺ᩵ۧ;

    iget-object v3, p0, Ll/֨᩵ۧ;->᩹:Ljava/util/Map;

    move-wide v1, p1

    invoke-virtual/range {v0 .. v5}, Ll/ܺ᩵ۧ;->֫(JLjava/util/Map;Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
