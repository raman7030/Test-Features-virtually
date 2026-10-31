.class public final Ll/ܽ۬ۖ;
.super Ljava/lang/Object;
.source "A4XC"

# interfaces
.implements Ll/۠ۙۖ;


# instance fields
.field public final synthetic ֫:Ll/᩻۬ۖ;

.field public final synthetic ۧ:Ljava/util/ArrayList;

.field public final synthetic ܽ:Ll/ᩳ᩶ۖ;

.field public final synthetic ᩳ:[Ll/۠᩶ۖ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩶ۖ;Ll/᩻۬ۖ;[Ll/۠᩶ۖ;Ljava/util/ArrayList;)V
    .locals 0

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۬ۖ;->ܽ:Ll/ᩳ᩶ۖ;

    iput-object p2, p0, Ll/ܽ۬ۖ;->֫:Ll/᩻۬ۖ;

    iput-object p3, p0, Ll/ܽ۬ۖ;->ᩳ:[Ll/۠᩶ۖ;

    iput-object p4, p0, Ll/ܽ۬ۖ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳ᩶ۖ;)Ll/۠᩶ۖ;
    .locals 2

    .line 198
    iget-object v0, p0, Ll/ܽ۬ۖ;->ܽ:Ll/ᩳ᩶ۖ;

    if-ne v0, p1, :cond_0

    .line 199
    iget-object p1, p0, Ll/ܽ۬ۖ;->֫:Ll/᩻۬ۖ;

    iget-object p1, p1, Ll/᩻۬ۖ;->ᩳ:Ljava/lang/String;

    .line 272
    new-instance v0, Ll/۟᩹ۖ;

    iget-object v1, p0, Ll/ܽ۬ۖ;->ᩳ:[Ll/۠᩶ۖ;

    invoke-direct {v0, v1, p1}, Ll/۟᩹ۖ;-><init>([Ll/۠᩶ۖ;Ljava/lang/String;)V

    .line 200
    iget-object p1, p0, Ll/ܽ۬ۖ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/ᩳ᩶ۖ;Ll/᩸᩶ۖ;)Ll/ᩳ᩶ۖ;
    .locals 0

    return-object p1
.end method
