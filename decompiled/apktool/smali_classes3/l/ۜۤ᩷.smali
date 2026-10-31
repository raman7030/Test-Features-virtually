.class public final Ll/ۜۤ᩷;
.super Ll/۟ܶۡ;
.source "31K1"


# instance fields
.field public final synthetic ۜ:Z

.field public ܳ:Z

.field public final synthetic ᩷:Ljava/util/List;

.field public final synthetic ᩻:Ll/ܿۛ᩷;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;Ljava/util/List;Z)V
    .locals 0

    .line 2170
    iput-object p1, p0, Ll/ۜۤ᩷;->᩻:Ll/ܿۛ᩷;

    iput-object p2, p0, Ll/ۜۤ᩷;->᩷:Ljava/util/List;

    iput-boolean p3, p0, Ll/ۜۤ᩷;->ۜ:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 2185
    iput-boolean v0, p0, Ll/ۜۤ᩷;->ܳ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 2190
    iget-object v0, p0, Ll/ۜۤ᩷;->᩻:Ll/ܿۛ᩷;

    invoke-static {v0, p1}, Ll/ܿۛ᩷;->֫(Ll/ܿۛ᩷;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 2175
    iget-object v0, p0, Ll/ۜۤ᩷;->᩻:Ll/ܿۛ᩷;

    const v1, 0x7f1200f2

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 2180
    iget-object v0, p0, Ll/ۜۤ᩷;->᩻:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->ܺ(Ll/ܿۛ᩷;)Ll/᩵ۨ᩷;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Ll/ۜۤ᩷;->᩷:Ljava/util/List;

    invoke-virtual {v0, v1}, Ll/᩵ۨ᩷;->֫(Ljava/util/List;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 2195
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 2196
    iget-boolean v0, p0, Ll/ۜۤ᩷;->ܳ:Z

    if-eqz v0, :cond_0

    .line 2197
    iget-object v0, p0, Ll/ۜۤ᩷;->᩻:Ll/ܿۛ᩷;

    iget-boolean v1, p0, Ll/ۜۤ᩷;->ۜ:Z

    invoke-static {v0, v1}, Ll/ܿۛ᩷;->֫(Ll/ܿۛ᩷;Z)V

    :cond_0
    return-void
.end method
