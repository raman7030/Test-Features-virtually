.class public final Ll/ܽ۫ܺ;
.super Ll/᩷۬ܺ;
.source "F4NW"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩶:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ll/ᩳ۫ܺ;)V
    .locals 0

    .line 1181
    invoke-direct {p0, p1}, Ll/᩷۬ܺ;-><init>(Ll/ۢ۬ܺ;)V

    .line 1182
    invoke-virtual {p1}, Ll/ᩳ۫ܺ;->comparator()Ljava/util/Comparator;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ۫ܺ;->᩶:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۜ۬ܺ;
    .locals 1

    .line 1187
    new-instance p1, Ll/ۧ۫ܺ;

    iget-object v0, p0, Ll/ܽ۫ܺ;->᩶:Ljava/util/Comparator;

    invoke-direct {p1, v0}, Ll/ۧ۫ܺ;-><init>(Ljava/util/Comparator;)V

    return-object p1
.end method
