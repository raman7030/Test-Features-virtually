.class public final Ll/ۛ֨֡;
.super Ljava/lang/Object;
.source "P6LY"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Z

.field public final ᩳ:Ll/᩹֨֡;


# direct methods
.method public constructor <init>(Ll/۬֨֡;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-static {p1}, Ll/۬֨֡;->ܽ(Ll/۬֨֡;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛ֨֡;->ܽ:Z

    .line 37
    invoke-static {p1}, Ll/۬֨֡;->ᩳ(Ll/۬֨֡;)Ll/᩹֨֡;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ֨֡;->ᩳ:Ll/᩹֨֡;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ll/۬֨֡;->֫(Ll/۬֨֡;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۛ֨֡;->֫:Ljava/util/ArrayList;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ll/۬֨֡;->ۧ(Ll/۬֨֡;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۛ֨֡;->ۧ:Ljava/util/ArrayList;

    .line 41
    invoke-static {p1}, Ll/۬֨֡;->ۧ(Ll/۬֨֡;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    new-instance p1, Ll/ۗ֨֡;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ֨֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ֨֡;->֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۛ֨֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ֨֡;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۛ֨֡;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ֨֡;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۛ֨֡;)Ll/᩹֨֡;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ֨֡;->ᩳ:Ll/᩹֨֡;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/֡ۚ֡;Ljava/lang/StringBuilder;)V
    .locals 2

    const-string v0, "node must not be null"

    .line 57
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    new-instance v0, Ll/ۤ֨֡;

    new-instance v1, Ll/ۨ֨֡;

    invoke-direct {v1, p2}, Ll/ۨ֨֡;-><init>(Ljava/lang/StringBuilder;)V

    invoke-direct {v0, p0, v1}, Ll/ۤ֨֡;-><init>(Ll/ۛ֨֡;Ll/ۨ֨֡;)V

    .line 59
    invoke-virtual {v0, p1}, Ll/ۤ֨֡;->ܽ(Ll/֡ۚ֡;)V

    .line 60
    invoke-virtual {v0, p1}, Ll/ۤ֨֡;->֫(Ll/֡ۚ֡;)V

    .line 61
    invoke-virtual {v0, p1}, Ll/ۤ֨֡;->ۧ(Ll/֡ۚ֡;)V

    return-void
.end method
