.class public final Ll/ܳۢ۠;
.super Ljava/lang/Object;
.source "O44L"


# instance fields
.field public ֫:Ll/֨᩷۠;

.field public final ۧ:[Ll/۟᩷۠;

.field public ܳ:Ll/ۛ᩸֨;

.field public final ܽ:Ll/ܽۢ۠;

.field public final ܿ:Ll/ܽۢ۠;

.field public ᩳ:Ll/᩷ۚ֨;

.field public final ᩻:Ll/۫᩷۠;


# direct methods
.method public constructor <init>(Ll/֨᩷۠;Ll/᩷ۚ֨;Ll/ۛ᩸֨;)V
    .locals 2

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x9

    new-array v0, v0, [Ll/۟᩷۠;

    .line 75
    iput-object v0, p0, Ll/ܳۢ۠;->ۧ:[Ll/۟᩷۠;

    .line 78
    iput-object p1, p0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    .line 80
    iput-object p3, p0, Ll/ܳۢ۠;->ܳ:Ll/ۛ᩸֨;

    .line 81
    new-instance p1, Ll/۫᩷۠;

    const/16 p3, 0x8

    invoke-direct {p1, p0, p3}, Ll/۟᩷۠;-><init>(Ll/ܳۢ۠;I)V

    iput-object p1, p0, Ll/ܳۢ۠;->᩻:Ll/۫᩷۠;

    .line 84
    new-instance p1, Ll/ܽۢ۠;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ll/ܽۢ۠;-><init>(Ll/ܳۢ۠;Z)V

    iput-object p1, p0, Ll/ܳۢ۠;->ܿ:Ll/ܽۢ۠;

    .line 85
    new-instance p1, Ll/ܽۢ۠;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v1}, Ll/ܽۢ۠;-><init>(Ll/ܳۢ۠;Z)V

    iput-object p1, p0, Ll/ܳۢ۠;->ܽ:Ll/ܽۢ۠;

    :goto_0
    if-ge v0, p3, :cond_0

    .line 86
    iget-object p1, p0, Ll/ܳۢ۠;->ۧ:[Ll/۟᩷۠;

    new-instance v1, Ll/ᩳۢ۠;

    invoke-direct {v1, p0, v0}, Ll/ᩳۢ۠;-><init>(Ll/ܳۢ۠;I)V

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 87
    :cond_0
    iget-object p1, p0, Ll/ܳۢ۠;->ۧ:[Ll/۟᩷۠;

    iget-object v0, p0, Ll/ܳۢ۠;->᩻:Ll/۫᩷۠;

    aput-object v0, p1, p3

    .line 88
    iput-object p2, p0, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۢ۠;->ۧ:[Ll/۟᩷۠;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۫֡֨;)Ll/֫ۢ۠;
    .locals 2

    .line 133
    new-instance v0, Ll/֫ۢ۠;

    iget-object v1, p0, Ll/ܳۢ۠;->ܳ:Ll/ۛ᩸֨;

    invoke-virtual {p1, v1}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v1

    iget p1, p1, Ll/۫֡֨;->ۛ:I

    invoke-direct {v0, p0, v1, p1}, Ll/֫ۢ۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;I)V

    return-object v0
.end method

.method public final ֫(I)Ll/ۛ᩷۠;
    .locals 2

    .line 183
    new-instance v0, Ll/ۛ᩷۠;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, v1}, Ll/ۛ᩷۠;-><init>(Ll/ܳۢ۠;ILl/ۢ᩷۠;Ll/ۢ᩷۠;)V

    return-object v0
.end method

.method public final ֫(Ll/ۙ֨֨;)Ll/۟᩷۠;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ܳۢ۠;->ۧ:[Ll/۟᩷۠;

    invoke-static {p1}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫()Ll/ܽۢ۠;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ܳۢ۠;->ܽ:Ll/ܽۢ۠;

    return-object v0
.end method

.method public final ۧ()Ll/ܽۢ۠;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܳۢ۠;->ܿ:Ll/ܽۢ۠;

    return-object v0
.end method
