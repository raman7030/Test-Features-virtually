.class public abstract Ll/۟ܽۧ;
.super Ljava/lang/Object;
.source "D2DZ"

# interfaces
.implements Ll/᩻ܳۧ;


# instance fields
.field public final ֫:Ll/ᩴܶ֫;

.field public final ۜ:I

.field public final ۧ:Ll/ۗ۠֫;

.field public final ܳ:Ll/۠ᩴ֫;

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:J

.field public final ᩷:I

.field public final ᩻:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/᩸۠֫;Ll/ۗ۠֫;ILl/۠ᩴ֫;ILjava/lang/Object;JJ)V
    .locals 1

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ll/ᩴܶ֫;

    invoke-direct {v0, p1}, Ll/ᩴܶ֫;-><init>(Ll/᩸۠֫;)V

    iput-object v0, p0, Ll/۟ܽۧ;->֫:Ll/ᩴܶ֫;

    .line 99
    iput-object p2, p0, Ll/۟ܽۧ;->ۧ:Ll/ۗ۠֫;

    .line 100
    iput p3, p0, Ll/۟ܽۧ;->᩷:I

    .line 101
    iput-object p4, p0, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    .line 102
    iput p5, p0, Ll/۟ܽۧ;->ۜ:I

    .line 103
    iput-object p6, p0, Ll/۟ܽۧ;->᩻:Ljava/lang/Object;

    .line 104
    iput-wide p7, p0, Ll/۟ܽۧ;->ܿ:J

    .line 105
    iput-wide p9, p0, Ll/۟ܽۧ;->ܽ:J

    .line 106
    invoke-static {}, Ll/ۧۧۧ;->֫()J

    move-result-wide p1

    iput-wide p1, p0, Ll/۟ܽۧ;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final ܽ()J
    .locals 2

    .line 119
    iget-object v0, p0, Ll/۟ܽۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v0}, Ll/ᩴܶ֫;->ܳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/۟ܽۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v0}, Ll/ᩴܶ֫;->᩻()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/util/Map;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/۟ܽۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v0}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
