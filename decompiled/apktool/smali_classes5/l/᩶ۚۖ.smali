.class public final Ll/᩶ۚۖ;
.super Ljava/lang/Object;
.source "69OZ"

# interfaces
.implements Ll/ۜ֡ۖ;


# instance fields
.field public final ֫:[I

.field public final ۧ:Ll/ۡ֡ۖ;

.field public final ܽ:[Ll/ܺۘۖ;

.field public final ܿ:Ll/ۛ֡ۖ;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۛ֡ۖ;Z[I[Ll/ܺۘۖ;Ljava/lang/Object;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/᩶ۚۖ;->ܿ:Ll/ۛ֡ۖ;

    .line 42
    iput-boolean p2, p0, Ll/᩶ۚۖ;->ᩳ:Z

    .line 43
    iput-object p3, p0, Ll/᩶ۚۖ;->֫:[I

    .line 44
    iput-object p4, p0, Ll/᩶ۚۖ;->ܽ:[Ll/ܺۘۖ;

    const-string p1, "defaultInstance"

    .line 45
    invoke-static {p5, p1}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Ll/ۡ֡ۖ;

    iput-object p5, p0, Ll/᩶ۚۖ;->ۧ:Ll/ۡ֡ۖ;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Ll/᩶ۚۖ;->ᩳ:Z

    return v0
.end method

.method public final ۧ()Ll/ۡ֡ۖ;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/᩶ۚۖ;->ۧ:Ll/ۡ֡ۖ;

    return-object v0
.end method

.method public final ܽ()Ll/ۛ֡ۖ;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/᩶ۚۖ;->ܿ:Ll/ۛ֡ۖ;

    return-object v0
.end method

.method public final ܿ()[Ll/ܺۘۖ;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/᩶ۚۖ;->ܽ:[Ll/ܺۘۖ;

    return-object v0
.end method

.method public final ᩳ()[I
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩶ۚۖ;->֫:[I

    return-object v0
.end method
