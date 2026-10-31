.class public final Ll/۫᩶ۡ;
.super Ll/֨ۙۡ;
.source "V1UX"


# static fields
.field public static final ᩻:[C


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public ۧ:Ll/۫᩶ۡ;

.field public ܳ:Z

.field public ܽ:I

.field public final ܿ:Ll/۬᩶ۡ;

.field public final ᩳ:Ljava/lang/StringBuilder;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x61

    :goto_0
    const/16 v2, 0x7a

    if-gt v1, v2, :cond_0

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    int-to-char v1, v1

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/۫᩶ۡ;->᩻:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ll/֨ۙۡ;-><init>()V

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/۫᩶ۡ;->ᩳ:Ljava/lang/StringBuilder;

    .line 14
    new-instance v0, Ll/۬᩶ۡ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۬᩶ۡ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/۫᩶ۡ;->ܿ:Ll/۬᩶ۡ;

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫᩶ۡ;->֫:Ljava/util/HashMap;

    .line 16
    iput-object v1, p0, Ll/۫᩶ۡ;->ۧ:Ll/۫᩶ۡ;

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Ll/۫᩶ۡ;->ܳ:Z

    return-void
.end method

.method public constructor <init>(Ll/۫᩶ۡ;)V
    .locals 2

    .line 38
    invoke-direct {p0}, Ll/֨ۙۡ;-><init>()V

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/۫᩶ۡ;->ᩳ:Ljava/lang/StringBuilder;

    .line 14
    new-instance v0, Ll/۬᩶ۡ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۬᩶ۡ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/۫᩶ۡ;->ܿ:Ll/۬᩶ۡ;

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫᩶ۡ;->֫:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Ll/۫᩶ۡ;->ܳ:Z

    .line 39
    iput-object p1, p0, Ll/۫᩶ۡ;->ۧ:Ll/۫᩶ۡ;

    return-void
.end method

.method private ܳ()V
    .locals 2

    .line 99
    iget v0, p0, Ll/۫᩶ۡ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۫᩶ۡ;->ܽ:I

    .line 100
    sget-object v1, Ll/۫᩶ۡ;->᩻:[C

    array-length v1, v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 101
    iput v0, p0, Ll/۫᩶ۡ;->ܽ:I

    .line 102
    iget-object v0, p0, Ll/۫᩶ۡ;->ۧ:Ll/۫᩶ۡ;

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Ll/۫᩶ۡ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۫᩶ۡ;-><init>(Ll/۫᩶ۡ;)V

    iput-object v0, p0, Ll/۫᩶ۡ;->ۧ:Ll/۫᩶ۡ;

    return-void

    .line 105
    :cond_0
    invoke-direct {v0}, Ll/۫᩶ۡ;->ܳ()V

    :cond_1
    return-void
.end method

.method private ܿ()Ljava/lang/StringBuilder;
    .locals 3

    .line 86
    iget v0, p0, Ll/۫᩶ۡ;->ܽ:I

    .line 88
    iget-object v1, p0, Ll/۫᩶ۡ;->ۧ:Ll/۫᩶ۡ;

    if-nez v1, :cond_0

    .line 89
    iget-object v1, p0, Ll/۫᩶ۡ;->ᩳ:Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_0

    .line 92
    :cond_0
    invoke-direct {v1}, Ll/۫᩶ۡ;->ܿ()Ljava/lang/StringBuilder;

    move-result-object v1

    .line 94
    :goto_0
    sget-object v2, Ll/۫᩶ۡ;->᩻:[C

    aget-char v0, v2, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object v1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 70
    invoke-direct {p0}, Ll/۫᩶ۡ;->ܿ()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 71
    iget-boolean v1, p0, Ll/۫᩶ۡ;->ܳ:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    const/16 v2, 0x5f

    .line 72
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 74
    :cond_0
    invoke-direct {p0}, Ll/۫᩶ۡ;->ܳ()V

    .line 76
    iget-object v1, p0, Ll/۫᩶ۡ;->ܿ:Ll/۬᩶ۡ;

    invoke-virtual {v1, v0}, Ll/۬᩶ۡ;->֫(Ljava/lang/StringBuilder;)V

    iget-object v2, p0, Ll/۫᩶ۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    return-object v1

    .line 80
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v1, Ll/۬᩶ۡ;

    invoke-direct {v1, v0}, Ll/۬᩶ۡ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Ll/۫᩶ۡ;->ۧ:Ll/۫᩶ۡ;

    const/4 v0, 0x0

    .line 65
    iput v0, p0, Ll/۫᩶ۡ;->ܽ:I

    return-void
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Ll/۫᩶ۡ;->ܳ:Z

    return-void
.end method
