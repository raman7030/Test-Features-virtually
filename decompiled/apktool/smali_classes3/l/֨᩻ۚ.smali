.class public final Ll/֨᩻ۚ;
.super Ll/ۘ۬֡;
.source "C2RY"


# instance fields
.field public final synthetic ᩸:Ll/֡ܽۚ;

.field public final synthetic ᩹:Ll/ᩳ᩻ۚ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩻ۚ;Ll/֡ܽۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    iput-object p1, p0, Ll/֨᩻ۚ;->᩹:Ll/ᩳ᩻ۚ;

    iput-object p2, p0, Ll/֨᩻ۚ;->᩸:Ll/֡ܽۚ;

    return-void
.end method


# virtual methods
.method public final ۘ()Ljava/util/List;
    .locals 3

    .line 212
    iget-object v0, p0, Ll/֨᩻ۚ;->᩸:Ll/֡ܽۚ;

    .line 213
    invoke-interface {v0}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/ۚ᩻ۚ;

    .line 214
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 213
    invoke-static {v0, v1}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object v0

    .line 110
    new-instance v1, Ll/ܺ᩻ۚ;

    iget-object v2, p0, Ll/֨᩻ۚ;->᩹:Ll/ᩳ᩻ۚ;

    invoke-direct {v1, v2, v0}, Ll/ܺ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ljava/util/List;)V

    return-object v1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 226
    iget-object v0, p0, Ll/֨᩻ۚ;->᩸:Ll/֡ܽۚ;

    invoke-interface {v0}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/֨᩻ۚ;->᩹:Ll/ᩳ᩻ۚ;

    invoke-interface {v1, v0}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
