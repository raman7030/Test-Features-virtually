.class public final Ll/ܺۖܺ;
.super Ljava/lang/Object;
.source "SBDM"

# interfaces
.implements Ll/ۧۘܺ;


# instance fields
.field public ֫:I

.field public final synthetic ۧ:Ll/ۖۖܺ;


# direct methods
.method public constructor <init>(Ll/ۖۖܺ;)V
    .locals 0

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۖܺ;->ۧ:Ll/ۖۖܺ;

    const/4 p1, 0x0

    .line 260
    iput p1, p0, Ll/ܺۖܺ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۘܺ;Ll/ܽۘܺ;)V
    .locals 2

    .line 264
    new-instance v0, Ll/ۡۖܺ;

    .line 286
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 287
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Ll/ۡۖܺ;->ۧ:Ljava/util/ArrayList;

    .line 265
    iget v1, p0, Ll/ܺۖܺ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܺۖܺ;->֫:I

    iput v1, v0, Ll/ۡۖܺ;->ܿ:I

    .line 266
    iput-object p1, v0, Ll/ۡۖܺ;->ᩳ:Ll/ܽۘܺ;

    .line 267
    iput-object p2, v0, Ll/ۡۖܺ;->ܽ:Ll/ܽۘܺ;

    .line 268
    iget-object p2, p0, Ll/ܺۖܺ;->ۧ:Ll/ۖۖܺ;

    invoke-static {p2}, Ll/ۖۖܺ;->ۧ(Ll/ۖۖܺ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    invoke-static {p2}, Ll/ۖۖܺ;->֫(Ll/ۖۖܺ;)[Ll/ۡۖܺ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܽۘܺ;->ۧ()I

    move-result p1

    aput-object v0, p2, p1

    return-void
.end method
