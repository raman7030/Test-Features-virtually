.class public final Ll/᩶᩺ۖ;
.super Ljava/lang/Object;
.source "J9FZ"


# instance fields
.field public ֫:Z

.field public ۧ:[B

.field public ܽ:Ll/᩵ܰۖ;


# direct methods
.method public constructor <init>(Ll/᩶᩺ۖ;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iget-object v0, p1, Ll/᩶᩺ۖ;->ܽ:Ll/᩵ܰۖ;

    iput-object v0, p0, Ll/᩶᩺ۖ;->ܽ:Ll/᩵ܰۖ;

    .line 51
    iget-boolean v0, p1, Ll/᩶᩺ۖ;->֫:Z

    iput-boolean v0, p0, Ll/᩶᩺ۖ;->֫:Z

    .line 53
    iget-object p1, p1, Ll/᩶᩺ۖ;->ۧ:[B

    iput-object p1, p0, Ll/᩶᩺ۖ;->ۧ:[B

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶᩺ۖ;Ll/᩵ܰۖ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩶᩺ۖ;->ܽ:Ll/᩵ܰۖ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶᩺ۖ;[B)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩶᩺ۖ;->ۧ:[B

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶᩺ۖ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩺ۖ;->ۧ:[B

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩶᩺ۖ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/᩶᩺ۖ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩵ܰۖ;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/᩶᩺ۖ;->ܽ:Ll/᩵ܰۖ;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 65
    iget-boolean v0, p0, Ll/᩶᩺ۖ;->֫:Z

    return v0
.end method
