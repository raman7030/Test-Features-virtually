.class public final Ll/ۖۨ֨;
.super Ll/ܽۛ֨;
.source "D7LF"


# instance fields
.field public final synthetic ܿ:Ll/ۖܶ۠;

.field public final synthetic ᩳ:Ll/֡ۨ֨;


# direct methods
.method public constructor <init>(Ll/֡ۨ֨;Ll/ۜۨ֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V
    .locals 0

    .line 507
    iput-object p1, p0, Ll/ۖۨ֨;->ᩳ:Ll/֡ۨ֨;

    iput-object p4, p0, Ll/ۖۨ֨;->ܿ:Ll/ۖܶ۠;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p3}, Ll/ܽۛ֨;-><init>(Ll/ۖܶ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 509
    iget-object v0, p0, Ll/ۖۨ֨;->ܿ:Ll/ۖܶ۠;

    iget-object v1, p0, Ll/ۖۨ֨;->ᩳ:Ll/֡ۨ֨;

    invoke-virtual {v1, v0}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/֡ۨ֨;->ܽ(Ll/ۖܶ۠;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
