.class public final Ll/۬֨֡;
.super Ljava/lang/Object;
.source "P6LY"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Z

.field public ᩳ:Ll/᩹֨֡;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Ll/۬֨֡;->ܽ:Z

    .line 78
    new-instance v0, Ll/᩹֨֡;

    invoke-direct {v0}, Ll/᩹֨֡;-><init>()V

    iput-object v0, p0, Ll/۬֨֡;->ᩳ:Ll/᩹֨֡;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۬֨֡;->֫:Ljava/util/ArrayList;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۬֨֡;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬֨֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬֨֡;->֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۬֨֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬֨֡;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/۬֨֡;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۬֨֡;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/۬֨֡;)Ll/᩹֨֡;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬֨֡;->ᩳ:Ll/᩹֨֡;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ۛ֨֡;
    .locals 1

    .line 88
    new-instance v0, Ll/ۛ֨֡;

    invoke-direct {v0, p0}, Ll/ۛ֨֡;-><init>(Ll/۬֨֡;)V

    return-object v0
.end method

.method public final ֫(Ll/ۙ֨֡;)V
    .locals 1

    .line 208
    iget-object v0, p0, Ll/۬֨֡;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/۫ܿܳ;)V
    .locals 1

    .line 191
    iget-object v0, p0, Ll/۬֨֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 132
    iput-boolean v0, p0, Ll/۬֨֡;->ܽ:Z

    return-void
.end method
