.class public final Ll/֨ۘܳ;
.super Ljava/lang/Object;
.source "D14B"


# instance fields
.field public final ֫:Ll/ᩳۜܳ;

.field public final ۧ:Ll/ۨܺ᩷;

.field public final ܽ:I

.field public final ᩳ:Ll/᩶ۖܳ;


# direct methods
.method public constructor <init>(Ll/ۢۧ᩻;Ll/᩶ۖܳ;I)V
    .locals 1

    .line 244
    iget-object v0, p2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    .line 222
    invoke-direct {p0, p1, p2, v0, p3}, Ll/֨ۘܳ;-><init>(Ll/ۢۧ᩻;Ll/᩶ۖܳ;Ll/ۨܺ᩷;I)V

    return-void
.end method

.method public constructor <init>(Ll/ۢۧ᩻;Ll/᩶ۖܳ;Ll/ۨܺ᩷;I)V
    .locals 0

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 226
    iput-object p1, p0, Ll/֨ۘܳ;->֫:Ll/ᩳۜܳ;

    .line 227
    iput-object p2, p0, Ll/֨ۘܳ;->ᩳ:Ll/᩶ۖܳ;

    .line 228
    iput-object p3, p0, Ll/֨ۘܳ;->ۧ:Ll/ۨܺ᩷;

    .line 229
    iput p4, p0, Ll/֨ۘܳ;->ܽ:I

    return-void
.end method

.method public constructor <init>(Ll/᩶ۖܳ;Ll/ۨܺ᩷;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 218
    invoke-direct {p0, v0, p1, p2, v1}, Ll/֨ۘܳ;-><init>(Ll/ۢۧ᩻;Ll/᩶ۖܳ;Ll/ۨܺ᩷;I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۘܳ;)Ll/ᩳۜܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۘܳ;->֫:Ll/ᩳۜܳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/֨ۘܳ;)Ll/ۨܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۘܳ;->ۧ:Ll/ۨܺ᩷;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֨ۘܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֨ۘܳ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/֨ۘܳ;)Ll/᩶ۖܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۘܳ;->ᩳ:Ll/᩶ۖܳ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 233
    iget-object v0, p0, Ll/֨ۘܳ;->֫:Ll/ᩳۜܳ;

    if-eqz v0, :cond_0

    iget v0, p0, Ll/֨ۘܳ;->ܽ:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
